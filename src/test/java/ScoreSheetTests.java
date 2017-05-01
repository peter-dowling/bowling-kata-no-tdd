/**
 * Created by Peter on 5/1/2017.
 */


import org.junit.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ScoreSheetTests {

    @Test
    @TestCaseId("Test score parsing 1")
    public void testScoreSheetParsing1() {
        String testScoreCard = "|--|--|--|--|--|--|--|--|--|--||";
        ScoreSheet testScoreSheet = new ScoreSheet(testScoreCard);
        String[] expectedResult = new String[]{"","--","--","--","--","--","--","--","--","--","--"};
        String[] result = testScoreSheet.parseScore();
        assertEquals("Parsed score incorrect, expected " + Arrays.toString(expectedResult) + " got " + Arrays.toString(result),  expectedResult, result);
    }

    @Test
    @TestCaseId("Test score parsing 2")
    public void testScoreSheetParsing2() {
        String testScoreCard = "|-5|59|X|67|-4|19|48|3/|58|29|134|";
        ScoreSheet testScoreSheet = new ScoreSheet(testScoreCard);
        String[] expectedResult = new String[]{"","-5","59","X","67","-4","19","48","3/","58","29","134"};
        String[] result = testScoreSheet.parseScore();
        assertEquals("Parsed score incorrect, expected " +  Arrays.toString(expectedResult) + " got " + Arrays.toString(result), expectedResult, result);
    }


}
