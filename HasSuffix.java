package String;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HasSuffix {


public boolean hasSuffix(String message,String suffix){
    int len1 = message.length();
    int len2 = suffix.length();
    if(len2>len1) {
      return false;
    }
    for (int i=0;i<len2;i++){
      if(suffix.charAt(len2-i-1) !=message.charAt(len1-i-1)){
        return false;
      }
    }
  return true;
 }  



@Test
public void verifyValidSuffix() {
	Assertions.assertEquals(hasSuffix("aaaabbbccccdddd", "cdddd"), true);
	}

@Test
public void verifyInvalidSuffix() {
	Assertions.assertEquals(hasSuffix("aaaabbbccccdddd", "aaaabbb"), false);
	}
}
