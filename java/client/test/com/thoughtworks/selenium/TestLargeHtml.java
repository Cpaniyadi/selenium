/*
Copyright 2012 Selenium committers
Copyright 2012 Software Freedom Conservancy

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/


package com.thoughtworks.selenium;

import com.thoughtworks.selenium.InternalSelenseTestBase;

import org.junit.Assert;
import org.junit.Test;

public class TestLargeHtml extends InternalSelenseTestBase {
  @Test
  public void testLargeHtml() {
    selenium.open("/selenium-server/tests/html/test_large_html.html");
    String source = selenium.getHtmlSource().trim();
    String expectedEndsWith = "</body>";
    int index = source.length() - expectedEndsWith.length();
    String actualEndsWith = source.substring(index).toLowerCase();
    Assert.assertEquals("source doesn't end correctly", actualEndsWith, expectedEndsWith);
  }
}
