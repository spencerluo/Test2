package com.luojiahui.jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test(groups="bbb")
  public void f() {
	  System.out.println("f");
	  int a = 2/0;
	  Reporter.log("f");
  }
  
  @Test(groups={"aaa"})
  public void g(){
	  System.out.println("g");
	  Reporter.log("g");
	  System.out.println("bc");
  }
}
