package StringUtils;

/*
<dependency>
<groupId>org.apache.commons</groupId>
<artifactId>commons-lang3</artifactId>
<version>3.0</version>
</dependency>

*/


import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {
        StringUtils.isBlank(" ");// isEmpty + trim

        StringUtils.countMatches("dsafaasga","l");// (string, znakDoZliczania) zlicza wystąpienia znaku w stringgu
        StringUtils.leftPad("STRING",10,'z'); // uzupelnij wyraz STRING do 10 znakow dodająć 'z' z lewej strony
        StringUtils.rightPad("STRING",10,'z');// uzupelnij wyraz STRING do 10 znakow dodająć 'z' z prawej strony
    }
}
