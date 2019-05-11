package controllers;

import models.Assessment;
import models.Member;
import play.Logger;
import play.mvc.Controller;

import java.util.List;

public class Dashboard extends Controller
{
  public static void index()
  {
    Logger.info("Rendering Dashboard");
    Member member = Accounts.getLoggedInMember();
    //Assessment assessment = assessment;
    List<Assessment> assessmentlist = member.assessmentlist;
    //Utility.calculateBMI(member.startingweight, member.height);
    render("dashboard.html", member, assessmentlist);
  }

  public static void addAssessment(double weight, double chest, double thigh, double upperArm, double waist, double hips)
  {
    Member member = Accounts.getLoggedInMember();
    Assessment assessment = new Assessment(weight, chest, thigh, upperArm, waist, hips);
    member.assessmentlist.add(assessment);
    member.save();
    Logger.info("Adding Assessment " + weight, chest, thigh, upperArm, waist, hips);
    redirect("/dashboard");
  }

  public static void deleteAssessment(Long id, Long assessmentid)
  {
    Member member = Member.findById(id);
    Assessment assessment = Assessment.findById(assessmentid);
    member.assessmentlist.remove(assessment);
    member.save();
    assessment.delete();
    Logger.info("Deleting " + assessment.weight + assessment.chest + assessment.thigh + assessment.upperArm + assessment.waist + assessment.hips);
    redirect("/dashboard");
  }
}
