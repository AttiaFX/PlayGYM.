package controllers;

import models.Assessment;
import models.Member;
import play.Logger;
import play.mvc.Controller;

import java.util.List;

public class Utility extends Controller
{
    public static double calculateBMI(Member member, Assessment assessment)
    {
        //Logger.info("Calculating BMI" );
        //Member member = Accounts.getLoggedInMember();
        //Assessment assessment = Assessment.findById(assessmentid);
        double bmi = member.startingweight/(member.height*member.height);
        return bmi;
    }

   // public static double calculateBMI(, double height)
    {
        //Logger.info("Calculating BMI" );
        // Member member = Accounts.getLoggedInMember();
        //Assessment assessment = Assessment.findById(assessmentid);
        //double bmi = weight/(height*height);
        //return bmi;
    }

    //public static String determineBMICategory(double bmi)
    {
        //if (bmi<16)
        {
            //("Severely Underweight: BMI < 16");
        }
        //else if (16 <=bmi && bmi<=18.4)
        {
            //("Underweight: 16 <= BMI <= 18.4" );
        }
        //else if (18.5<=bmi && bmi< 25)
        {
            //("Normal: 18.5 <= BMI < 25" );
        }
        //else if (25<=bmi && bmi< 30)
        {
            //("Overweight: BMI >= 30" );
        }

        //else if (30<=bmi && bmi< 35)
        {
            //("Moderately Obese: BMI >= 30" );
        }

        //else if ( bmi< 35)
        {
            //("Severely Obese: BMI >= 30" );
        }
    }

    //public static boolean isIdealBodyWeight(Member member, Assessment assessment)
    {

    }
}
