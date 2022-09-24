/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.entertainment.catalog;

import static org.junit.Assert.*;
import java.util.Collection;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import com.entertainment.Television;

public class CatalogTest {
  
  /**
   * Contract: a no-matches result should be an empty collection (not null).
   */
  @Test
  public void testFindByBrandNoMatches() {
    Collection<Television> tvs = Catalog.findByBrand("NO-MATCHES");
    assertNotNull(tvs);
    assertTrue(tvs.isEmpty());
  }

  @Test
  public void testFindByBrandWithMatches(){
    Collection<Television> tvs = Catalog.findByBrand("Sony");
    assertNotNull(tvs);
    assertFalse(tvs.isEmpty());
    assertEquals(7,tvs.size());
  }

  @Test
  public void testFindByBrandsNoBrands(){
    Map<String,Collection<Television>> tvsMap = Catalog.findByBrands(); // pass empty string array
    assertNotNull(tvsMap);
    assertTrue(tvsMap.isEmpty());

    Map<String,Collection<Television>> tvsMap1 = Catalog.findByBrands("RokuTV", "Apple", "Samsung");
    assertNotNull(tvsMap1);
    assertTrue(tvsMap1.isEmpty());
  }

  @Test
  public void testFindByBrandsSomeBrands(){
    Map<String,Collection<Television>> tvsMap3 = Catalog.findByBrands("Hitachi", "RCA", "Zenith");
    assertNotNull(tvsMap3);
    assertTrue(!tvsMap3.isEmpty());

  }
}