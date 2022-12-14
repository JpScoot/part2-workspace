/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.personnel;

import java.sql.Date;
import java.util.Map;
import java.util.Set;

public class EmployeeFactory {

  private static final Set<String> VALID_TYPES = Set.of("SE", "HE");
  private static final String BAD_TYPE_FORMAT = "% is not a valid employee type; must be SE or HE.";

  // prevent direct instantiation - this is an all-static factory class
  private EmployeeFactory() {
  }

  /**
   * TODO: given the input map, create and return the correct object (with its properties set).
   * If the input map's "type" value is not "HE" or "SE", throw IllegalArgumentException with a suitable message.
   */
  public static Employee createEmployee(Map<String, String> inputMap)
      throws IllegalArgumentException {
    // return value
    Employee emp = null;
    String type = inputMap.get("type");
    // If type is not equal to HE or SE throw IllegalArgumentException with string message
    //Read the name and the hireDate from inputMap. Remember hireDate is java.sql.Date
    //if type is equal to HE, then read rate and hours of inputMap, (parse) rate and hours
    //if type is equal to SE then read and parse salary from inoutMap, create an instance of HourlyEmployee
    //and SalariedEmployee
    if (!VALID_TYPES.contains(type)){
      throw new IllegalArgumentException(String.format(BAD_TYPE_FORMAT));
  }
    String name = inputMap.get("name");
    Date hireDate = Date.valueOf(inputMap.get("hireDate"));
    if(type.equals("SE")){
      Double salary = Double.valueOf(inputMap.get("salary"));
      emp = new SalariedEmployee(name, hireDate, salary);
    } else {
      Double rate = Double.valueOf(inputMap.get("rate"));
      Double hours = Double.valueOf(inputMap.get("hours"));
      emp = new HourlyEmployee(name, hireDate, rate, hours);
    }
    return emp;
}
}