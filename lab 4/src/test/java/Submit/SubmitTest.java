package Submit;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SubPage;
import pages.SubPage;

import static org.testng.Assert.assertEquals;
public class SubmitTest extends BaseTest {


    @Test
    public void testSubmission0 (){

        setup();
        SubPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }

    @Test
    public void testSubmission1 (){
        setup();
        webForm.setFirstName("ragui");
        SubPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }

    @Test
    public void testSubmission2 (){
        setup();
        webForm.setFirstName("ragui");
        webForm.setLastName("chawkat");
        SubPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }


    @Test
    public void testSubmission3 (){
        setup();
        webForm.setFirstName("ragui");
        webForm.setLastName("chawkat");
        webForm.setJobTitle("Student");
        SubPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }


    @Test
    public void testSubmission4 (){
        setup();
        webForm.setFirstName("ragui");
        webForm.setLastName("chawkat");
        webForm.setJobTitle("Student");
        webForm.setHighestLevelOfEduction("high school");
        SubPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }

    @Test
    public void testSubmission5 (){
        setup();
        webForm.setFirstName("ragui");
        webForm.setLastName("chawkat");
        webForm.setJobTitle("Student");
        webForm.setHighestLevelOfEduction("College");
        SubPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }
}


