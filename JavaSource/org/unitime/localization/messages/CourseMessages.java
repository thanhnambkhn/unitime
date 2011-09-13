/*
 * Copyright (C) 2011, UniTime LLC, and individual contributors
 * as indicated by the @authors tag.
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along
 * with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
*/
package org.unitime.localization.messages;

import org.unitime.timetable.action.ClassSearchAction;
import org.unitime.timetable.action.InstructionalOfferingSearchAction;


/**
 * @author Tomas Muller
 */
public interface CourseMessages extends Messages {
	
	@DefaultMessage("Filter")
	String filter();
	
	@DefaultMessage("Optional Columns:")
	String filterOptionalColumns();
	
	@DefaultMessage("Manager:")
	String filterManager();
	
	@DefaultMessage("Instructional Type:")
	String filterInstructionalType();

	@DefaultMessage("Instructor:")
	String filterInstructor();
	
	@DefaultMessage("Assigned Time:")
	String filterAssignedTime();
	
	@DefaultMessage("Assigned Room:")
	String filterAssignedRoom();
	
	@DefaultMessage("from")
	String filterTimeFrom();
	
	@DefaultMessage("for")
	String filterTimeFor();
	
	@DefaultMessage("minutes")
	String filterTimeMinutes();
	
	@DefaultMessage("Parent Class:")
	String propertyParentClass();
	
	@DefaultMessage("Parent Scheduling Subpart:")
	String propertyParentSchedulingSubpart();
	
	@DefaultMessage("External Id:")
	String propertyExternalId();
	
	@DefaultMessage("Enrollment:")
	String propertyEnrollment();
	
	@DefaultMessage("Class Limit:")
	String propertyClassLimit();
	
	@DefaultMessage("Minimum Class Limit:")
	String propertyMinimumClassLimit();
	
	@DefaultMessage("Maximum Class Limit:")
	String propertyMaximumClassLimit();
	
	@DefaultMessage("Number of Rooms:")
	String propertyNumberOfRooms();
	
	@DefaultMessage("Room Ratio:")
	String propertyRoomRatio();
	
	@DefaultMessage("Minimum Room Capacity:")
	String propertyMinimumRoomCapacity();
	
	@DefaultMessage("Date Pattern:")
	String propertyDatePattern();
	
	@DefaultMessage("Date:")
	String propertyDate();
	
	@DefaultMessage("Display Instructors:")
	String propertyDisplayInstructors();
	
	@DefaultMessage("Display In Schedule Book:")
	String propertyDisplayInScheduleBook();
	
	@DefaultMessage("Student Schedule Note:")
	String propertyStudentScheduleNote();
	
	@DefaultMessage("Requests / Notes:")
	String propertyRequestsNotes();
	
	@DefaultMessage("Instructors:")
	String propertyInstructors();
	
	@DefaultMessage("Instructor:")
	String propertyInstructor();
	
	@DefaultMessage("Time:")
	String propertyTime();
	
	@DefaultMessage("Examination Periods:")
	String propertyExaminationPeriods();
	
	@DefaultMessage("Room Groups:")
	String propertyRoomGroups();
	
	@DefaultMessage("Rooms:")
	String propertyRooms();
	
	@DefaultMessage("Room:")
	String propertyRoom();
	
	@DefaultMessage("Buildings:")
	String propertyBuildings();
	
	@DefaultMessage("Room Features:")
	String propertyRoomFeatures();
	
	@DefaultMessage("Available Rooms:")
	String propertyAvailableRooms();
	
	@DefaultMessage("Distribution:")
	String propertyDistribution();
	
	@DefaultMessage("Initial Assignment:")
	String propertyInitialAssignment();
	
	@DefaultMessage("Student Conflicts:")
	String propertyStudentConflicts();
	
	@DefaultMessage("Violated Constraints:")
	String propertyViolatedConstraints();
	
	@DefaultMessage("Room Locations:")
	String propertyRoomLocations();
	
	@DefaultMessage("Time Locations:")
	String propertyTimeLocations();
	
	@DefaultMessage("Date Patterns:")
	String propertyDatePatterns();
	
	@DefaultMessage("Minimum Room Size:")
	String propertyMinimumRoomSize();
	
	@DefaultMessage("Note:")
	String propertyNote();
	
	@DefaultMessage("Automatic Spread In Time:")
	String propertyAutomaticSpreadInTime();
	
	@DefaultMessage("Student Overlaps:")
	String propertyStudentOverlaps();
	
	@DefaultMessage("Credit:")
	String propertyCredit();
	
	@DefaultMessage("Subpart Credit:")
	String propertySubpartCredit();
	
	@DefaultMessage("Credit Type:")
	String propertyCreditType();
	
	@DefaultMessage("Credit Unit Type:")
	String propertyCreditUnitType();
	
	@DefaultMessage("Units:")
	String propertyUnits();
	
	@DefaultMessage("Max Units:")
	String propertyMaxUnits();
	
	@DefaultMessage("Fractional Increments Allowed:")
	String propertyFractionalIncrementsAllowed();
	
	@DefaultMessage("Configuration Name:")
	String propertyConfigurationName();
	
	@DefaultMessage("Unlimited Enrollment:")
	String propertyUnlimitedEnrollment();
	
	@DefaultMessage("Configuration Limit:")
	String propertyConfigurationLimit();
	
	@DefaultMessage("Course Catalog:")
	String propertyCourseCatalog();
	
	@DefaultMessage("Title:")
	String propertyCourseTitle();
	
	@DefaultMessage("Schedule of Classes Note:")
	String propertyScheduleOfClassesNote();
	
	@DefaultMessage("Consent:")
	String propertyConsent();
	
	@DefaultMessage("Designator Required:")
	String propertyDesignatorRequired();
	
	@DefaultMessage("Coordinators:")
	String propertyCoordinators();
	
	@DefaultMessage("Take Course Demands from Offering:")
	String propertyTakeCourseDemandsFromOffering();	
	
	@DefaultMessage("Instructional Offering Limit:")
	String propertyIOLimit();
	
	@DefaultMessage("Course Offerings:")
	String propertyCourseOfferings();
	
	@DefaultMessage("By Reservation Only:")
	String propertyByReservationOnly();
	
	@DefaultMessage("this one")
	String messageThisOne(); //used in getAssignmentTable - if the initial assignment is "this one"
	
//	@DefaultMessage("Parent Class:")
//	String propertyParentClass();
	
	@DefaultMessage("Normal")
	String examSeatingTypeNormal();
	
	@DefaultMessage("Exam")
	String examSeatingTypeExam();
	
	@DefaultMessage("examinations")
	String examinations(); //used in ExamsAction.java, in PdfWebTable getTable
		
	@DefaultMessage("Sort classes only within scheduling subparts")
	String checkSortWithinSubparts();
	
	@DefaultMessage("All")
	String dropDeptAll();
	
	@DefaultMessage("All")
	String dropManagerAll();
	
	@DefaultMessage("Department")
	String dropDeptDepartment();
	
	@DefaultMessage("All")
	String dropITypeAll();
	
	@DefaultMessage("External Id")
	String columnExternalId();

	@DefaultMessage("Enrollment Information")
	String columnEnrollmentInformation();
	
	@DefaultMessage("Enrollment")
	String columnDemand();
	
	@DefaultMessage("Last Enrollment")
	String columnLastDemand();

	@DefaultMessage("Projected Demand")
	String columnProjectedDemand();

	@DefaultMessage("Limit")
	String columnLimit();

	@DefaultMessage("Room Ratio")
	String columnRoomRatio();

	@DefaultMessage("Manager")
	String columnManager();

	@DefaultMessage("Date/Time Information")
	String columnDateTimeInformation();

	@DefaultMessage("Date Pattern")
	String columnDatePattern();
	
	@DefaultMessage("Minutes Per Week")
	String columnMinPerWk();
	
	@DefaultMessage("Time Pattern")
	String columnTimePattern();
	
	@DefaultMessage("Preferences")
	String columnPreferences();
	
	@DefaultMessage("Instructor")
	String columnInstructor();
	
	@DefaultMessage("Timetable")
	String columnTimetable();
	
	@DefaultMessage("Catalog Information")
	String columnCatalogInformation();
	
	@DefaultMessage("Title")
	String columnTitle();

	@DefaultMessage("Offering Credit")
	String columnOfferingCredit();

	@DefaultMessage("Subpart Credit")
	String columnSubpartCredit();

	@DefaultMessage("Consent")
	String columnConsent();

	@DefaultMessage("Designator Required")
	String columnDesignatorRequired();

	@DefaultMessage("Schedule of Classes Note")
	String columnSchedulePrintNote();
	
	@DefaultMessage("Student Schedule Note")
	String columnStudentScheduleNote();

	@DefaultMessage("Note to Schedule Manager")
	String columnNote();
	
	@DefaultMessage("Examinations")
	String columnExams();

	@DefaultMessage("Examination")
	String columnExam();

	@DefaultMessage("{0} {1} Examination")
	String tooltipExam(String label, String type);

	@DefaultMessage("Name")
	String columnExamName();

	@DefaultMessage("Period")
	String columnExamPeriod();

	@DefaultMessage("Room")
	String columnExamRoom();
	
	@DefaultMessage("Time")
	String columnTimePref();
	
	@DefaultMessage("Room&nbsp;Group")
	String columnRoomGroupPref();
	
	@DefaultMessage("Bldg")
	String columnBuildingPref();
	
	@DefaultMessage("Room")
	String columnRoomPref();
	
	@DefaultMessage("Features")
	String columnRoomFeaturePref();
	
	@DefaultMessage("Distribution")
	String columnDistributionPref();
	
	@DefaultMessage("Room")
	String columnAllRoomPref();
	
	@DefaultMessage("Time")
	String columnAssignedTime();
	
	@DefaultMessage("Room")
	String columnAssignedRoom();
	
	@DefaultMessage("Room Cap")
	String columnAssignedRoomCapacity();
	
	@DefaultMessage("Name")
	String columnInstructorName();

	@DefaultMessage("% Share")
	String columnInstructorShare();
	
	@DefaultMessage("Check Conflicts")
	String columnInstructorCheckConflicts();
	
	@DefaultMessage("Classes / Courses")
	String columnExamClassesCourses();
	
	@DefaultMessage("Type")
	String columnExamType();
	
	@DefaultMessage("Length")
	String columnExamLength();
	
	@DefaultMessage("Seating<br>Type")
	String columnExamSeatingType();
	
	@DefaultMessage("Size")
	String columnExamSize();
	
	@DefaultMessage("Max<br>Rooms")
	String columnExamMaxRooms();
	
	@DefaultMessage("Instructor")
	String columnExamInstructor();
	
	@DefaultMessage("Period<br>Preferences")
	String columnExamPeriodPreferences();

	@DefaultMessage("Room<br>Preferences")
	String columnExamRoomPreferences();
	
	@DefaultMessage("Distribution<br>Preferences")
	String columnExamDistributionPreferences();
	
	@DefaultMessage("Assigned<br>Period")
	String columnExamAssignedPeriod();
	
	@DefaultMessage("Assigned<br>Room")
	String columnExamAssignedRoom();
	
	@DefaultMessage("Student<br>Conflicts")
	String columnExamStudentConflicts();
	
	@DefaultMessage("Subject")
	String columnExamSubject();
	
	@DefaultMessage("Course")
	String columnExamCourse();
	
	@DefaultMessage("External Id")
	String columnExamExternalId();
	
	@DefaultMessage("Instructional Type")
	String columnExamInstructionalType();

	@DefaultMessage("Section")
	String columnExamSection();
	
	@DefaultMessage("Date")
	String columnExamDate();

	@DefaultMessage("Time")
	String columnExamTime();
	
	@DefaultMessage(" Type ")
	String columnDistrPrefType();
	
	@DefaultMessage(" Structure ")
	String columnDistrPrefStructure();

	@DefaultMessage(" Owner ")
	String columnDistrPrefOwner();
	
	@DefaultMessage(" Class ")
	String columnDistrPrefClass();
	
	@DefaultMessage("Min Limit<br>per Class")
	String columnSubpartMinLimitPerClass();
	
	@DefaultMessage("Max Limit<br>per Class")
	String columnSubpartMaxLimitPerClass();
	
	@DefaultMessage("Number<br>of Classes")
	String columnSubpartNumberOfClasses();
	
	@DefaultMessage("Minutes<br>per Week")
	String columnSubpartMinutesPerWeek();
	
	@DefaultMessage("Number<br>of Rooms")
	String columnSubpartNumberOfRooms();
	
	@DefaultMessage("Room<br>Ratio")
	String columnSubpartRoomRatio();
	
	@DefaultMessage("Managing<br>Department")
	String columnSubpartManagingDepartment();
	
	@DefaultMessage("Limit<br>per Class")
	String columnSubpartLimitPerClass();
	
	@DefaultMessage("Offering")
	String columnCrossListsOffering();
	
	@DefaultMessage("Controlling")
	String columnCrossListsControlling();
	
	@DefaultMessage("Reserved")
	String columnCrossListsReserved();

	@DefaultMessage("Projected")
	String columnCrossListsProjected();
	
	@DefaultMessage("Last Term")
	String columnCrossListsLastTerm();
		
	@DefaultMessage("Total")
	String rowCrossListsTotal();
	
	@DefaultMessage("Not assigned.")
	String messageNotAssigned();

	@DefaultMessage("{0} - Do Not Display In Schedule Book.")
	String tooltipDoNotDisplayInScheduleBook(String classLabelWithTitle);
	
	@DefaultMessage("Has Schedule Print Note")
	String altHasSchedulePrintNote();
	
	@DefaultMessage("Has Course Offering Note")
	String altHasCourseOfferingNote();
	
	@DefaultMessage("Has Note to Mgr")
	String altHasNoteToMgr();
	
	@DefaultMessage("Delete")
	String altDelete();
	
	@DefaultMessage("Move Up")
	String altMoveUp();
	
	@DefaultMessage("Move Down")
	String altMoveDown();
	
	@DefaultMessage("Limits do not match")
	String altCrossListsLimitsDoNotMatch();
	
	@DefaultMessage("Configuration {0}")
	String labelConfiguration(String name);
	
	@DefaultMessage("Not Offered Courses")
	String labelNotOfferedCourses();
	
	@DefaultMessage("Offered Courses")
	String labelOfferedCourses();
	
	@DefaultMessage("There are no courses currently offered for this subject.")
	String errorNoCoursesOffered();

	@DefaultMessage("All courses are currently being offered for this subject.")
	String errorAllCoursesOffered();
	
	@DefaultMessage("Sort By:")
	String filterSortBy();
	
	@DefaultMessage("Subject:")
	String filterSubject();

	@DefaultMessage("Course Number:")
	String filterCourseNumber();

	@DefaultMessage("Search")
	@StrutsAction(
		value = "searchInstructionalOfferings",
		apply = InstructionalOfferingSearchAction.class
	)
	String actionSearchInstructionalOfferings();
	
	@DefaultMessage("Search")
	@StrutsAction(
		value = "searchClasses",
		apply = ClassSearchAction.class
	)
	String actionSearchClasses();

	@DefaultMessage("Export PDF")
	@StrutsAction("exportPdf")
	String actionExportPdf();

	@DefaultMessage("Worksheet PDF")
	@StrutsAction("worksheetPdf")
	String actionWorksheetPdf();

	@DefaultMessage("Add New")
	@StrutsAction("addInstructionalOfferings")
	String actionAddNewInstructionalOffering();
	
	@DefaultMessage("Edit Class")
	String actionEditClass();
	
	@DefaultMessage("Add Distribution Preference")
	String actionAddDistributionPreference();
	
	@DefaultMessage("Assign")
	String actionOpenClassAssignmentDialog();
		
	@DefaultMessage("Previous")
	String actionPreviousClass();
	
	@DefaultMessage("Previous")
	String actionPreviousSubpart();
	
	@DefaultMessage("Previous")
	String actionPreviousInstructor();
	
	@DefaultMessage("Previous")
	String actionPreviousExamination();
	
	@DefaultMessage("Next")
	String actionNextClass();

	@DefaultMessage("Next")
	String actionNextSubpart();
	
	@DefaultMessage("Next")
	String actionNextInstructor();
	
	@DefaultMessage("Next")
	String actionNextExamination();
	
	@DefaultMessage("Back")
	String actionBackClassDetail();
	
	@DefaultMessage("Back")
	String actionBackSubpartDetail();
	
	@DefaultMessage("Back")
	String actionBackToDetail();
	
	@DefaultMessage("Back")
	String actionBackToIODetail();
	
	@DefaultMessage("Update")
	String actionUpdatePreferences();
	
	@DefaultMessage("Update")
	String actionUpdateExamination();
	
	@DefaultMessage("Update")
	String actionUpdateConfiguration();
	
	@DefaultMessage("Update")
	String actionUpdateCourseOffering();
	
	@DefaultMessage("Update")
	String actionUpdateCrossLists();
	
	@DefaultMessage("Clear Class Preferences")
	String actionClearClassPreferences();
	
	@DefaultMessage("Clear Subpart Preferences")
	String actionClearSubpartPreferences();

	@DefaultMessage("Clear Instructor Preferences")
	String actionClearInstructorPreferences();

	@DefaultMessage("Add Time Preference")
	String actionAddTimePreference();
	
	@DefaultMessage("Delete")
	String actionRemoveTimePattern();
	
	@DefaultMessage("Add Room Group Preference")
	String actionAddRoomGroupPreference();
	
	@DefaultMessage("Delete")
	String actionRemoveRoomGroupPreference();
	
	@DefaultMessage("Add Room Preference")
	String actionAddRoomPreference();
	
	@DefaultMessage("Delete")
	String actionRemoveRoomPreference();
	
	@DefaultMessage("Add Building Preference")
	String actionAddBuildingPreference();
	
	@DefaultMessage("Delete")
	String actionRemoveBuildingPreference();

	@DefaultMessage("Add Room Feature Preference")
	String actionAddRoomFeaturePreference();
	
	@DefaultMessage("Delete")
	String actionRemoveRoomFeaturePreference();
	
	@DefaultMessage("Delete")
	String actionRemoveDistributionPreference();
	
	@DefaultMessage("Delete")
	String actionDeleteConfiguration();
	
	@DefaultMessage("Save")
	String actionSaveExamination();
	
	@DefaultMessage("Save")
	String actionSaveConfiguration();
	
	@DefaultMessage("Add Instructor")
	String actionAddInstructor();
	
	@DefaultMessage("Delete")
	String actionRemoveInstructor();
	
	@DefaultMessage("Add Examination")
	String actionAddExamination();
	
	@DefaultMessage("Edit Subpart")
	String actionEditSubpart();
	
	@DefaultMessage("Clear Class Preferences")
	String actionClearClassPreferencesOnSubpart();
	
	@DefaultMessage("Add")
	String actionAddInstructionalTypeToConfig();
	
	@DefaultMessage("Add")
	String actionAddCourseToCrossList();

	@DefaultMessage("Add Coordinator")
	String actionAddCoordinator();
	
	@DefaultMessage("Delete")
	String actionRemoveCoordinator();

	@DefaultMessage("S")
	String accessSearchInstructionalOfferings();
	
	@DefaultMessage("S")
	String accessSearchClasses();

	@DefaultMessage("P")
	String accessExportPdf();
	
	@DefaultMessage("W")
	String accessWorksheetPdf();

	@DefaultMessage("A")
	String accessAddNewInstructionalOffering();

	@DefaultMessage("E")
	String accessEditClass();
	
	@DefaultMessage("A")
	String accessAddDistributionPreference();
	
	@DefaultMessage("X")
	String accessOpenClassAssignmentDialog();

	@DefaultMessage("P")
	String accessPreviousClass();

	@DefaultMessage("P")
	String accessPreviousSubpart();
	
	@DefaultMessage("P")
	String accessPreviousInstructor();
	
	@DefaultMessage("P")
	String accessPreviousExamination();

	@DefaultMessage("N")
	String accessNextClass();
	
	@DefaultMessage("N")
	String accessNextSubpart();
	
	@DefaultMessage("N")
	String accessNextInstructor();
	
	@DefaultMessage("N")
	String accessNextExamination();
	
	@DefaultMessage("B")
	String accessBackClassDetail();
	
	@DefaultMessage("B")
	String accessBackSubpartDetail();
	
	@DefaultMessage("B")
	String accessBackToDetail();
	
	@DefaultMessage("B")
	String accessBackToIODetail();
	
	@DefaultMessage("I")
	String accessInstructionalOfferingDetail();
	
	@DefaultMessage("S")
	String accessSchedulingSubpartDetail();
	
	@DefaultMessage("U")
	String accessUpdatePreferences();
	
	@DefaultMessage("U")
	String accessUpdateExamination();
	
	@DefaultMessage("U")
	String accessUpdateConfiguration();
	
	@DefaultMessage("U")
	String accessUpdateCourseOffering();
	
	@DefaultMessage("U")
	String accessUpdateCrossLists();
	
	@DefaultMessage("C")
	String accessClearClassPreferences();

	@DefaultMessage("C")
	String accessClearSubpartPreferences();
	
	@DefaultMessage("C")
	String accessClearInstructorPreferences();
	
	@DefaultMessage("T")
	String accessAddTimePreference();
	
	@DefaultMessage("G")
	String accessAddRoomGroupPreference();
	
	@DefaultMessage("R")
	String accessAddRoomPreference();
	
	@DefaultMessage("D")
	String accessAddBuildingPreference();

	@DefaultMessage("F")
	String accessAddRoomFeaturePreference();
	
	@DefaultMessage("S")
	String accessSaveExamination();
	
	@DefaultMessage("S")
	String accessSaveConfiguration();
	
	@DefaultMessage("I")
	String accessAddInstructor();
	
	@DefaultMessage("X")
	String accessAddExamination();
	
	@DefaultMessage("E")
	String accessEditSubpart();
	
	@DefaultMessage("D")
	String accessDeleteConfiguration();
	
	@DefaultMessage("A")
	String accessAddInstructionalTypeToConfig();
	
	@DefaultMessage("A")
	String accessAddCourseToCrossList();
	
	@DefaultMessage("I")
	String accessBackToIOList();
	
	@DefaultMessage("C")
	String accessAddCoordinator();
	
	@DefaultMessage("Search/Display Offerings (Alt+{0})")
	String titleSearchInstructionalOfferings(String accessKey);

	@DefaultMessage("Search/Display Classes (Alt+{0})")
	String titleSearchClasses(String accessKey);
	
	@DefaultMessage("Export PDF (Alt+{0})")
	String titleExportPdf(String accessKey);

	@DefaultMessage("Export Worksheet PDF (Alt+{0})")
	String titleWorksheetPdf(String accessKey);

	@DefaultMessage("Add New Offering (Alt+{0})")
	String titleAddNewInstructionalOffering(String accessKey);

	@DefaultMessage("Edit Class (Alt+{0})")
	String titleEditClass(String accessKey);
	
	@DefaultMessage("Add Distribution Preference (Alt+{0})")
	String titleAddDistributionPreference(String accessKey);
	
	@DefaultMessage("Open Class Assignment Dialog (Alt+{0})")
	String titleOpenClassAssignmentDialog(String accessKey);
		
	@DefaultMessage("Previous Class (Alt+{0})")
	String titlePreviousClass(String accessKey);
	
	@DefaultMessage("Update and go to previous Class (Alt+{0})")
	String titlePreviousClassWithUpdate(String accessKey);
	
	@DefaultMessage("Previous Scheduling Subpart (Alt+{0}")
	String titlePreviousSubpart(String accessKey);
	
	@DefaultMessage("Update and go to previous Scheduling Subpart (Alt+{0})")
	String titlePreviousSubpartWithUpdate(String accessKey);
	
	@DefaultMessage("Update and go to previous Instructor (Alt+{0})")
	String titlePreviousInstructorWithUpdate(String accessKey);
	
	@DefaultMessage("Update and go to previous Examination (Alt+{0})")
	String titlePreviousExaminationWithUpdate(String accessKey);

	@DefaultMessage("Next Class (Alt+{0})")
	String titleNextClass(String accessKey);
	
	@DefaultMessage("Update and go to next Class (Alt+{0})")
	String titleNextClassWithUpdate(String accessKey);
	
	@DefaultMessage("Next Scheduling Subpart (Alt+{0})")
	String titleNextSubpart(String accessKey);
	
	@DefaultMessage("Update and go to next Scheduling Subpart (Alt+{0})")
	String titleNextSubpartWithUpdate(String accessKey);
	
	@DefaultMessage("Update and go to next Instructor (Alt+{0})")
	String titleNextInstructorWithUpdate(String accessKey);
	
	@DefaultMessage("Update and go to next Examination (Alt+{0})")
	String titleNextExaminationWithUpdate(String accessKey);
	
	@DefaultMessage("Update Examination (Alt+{0})")
	String titleUpdateExamination(String accessKey);
	
	@DefaultMessage("Update Configuration (Alt+{0})")
	String titleUpdateConfiguration(String accessKey);
	
	@DefaultMessage("Update Course Offering (Alt+{0})")
	String titleUpdateCourseOffering(String accessKey);
	
	@DefaultMessage("Update Cross Lists (Alt+{0})")
	String titleUpdateCrossLists(String accessKey);
	
	@DefaultMessage("Return to %% (Alt+{0})")
	String titleBackClassDetail(String accessKey);
	
	@DefaultMessage("Return to %% (Alt+{0})")
	String titleBackSubpartDetail(String accessKey);
	
	@DefaultMessage("Do not commit any change. Return to Detail Screen (Alt+{0})")
	String titleBackToDetail(String accessKey);
	
	@DefaultMessage("Back to Instructional Offering Detail (Alt+{0})")
	String titleBackToIODetail (String accessKey);
	
	@DefaultMessage("Instructional Offering Detail (Alt+{0})")
	String titleInstructionalOfferingDetail(String accessKey);
	
	@DefaultMessage("Scheduling Subpart Detail (Alt+{0})")
	String titleSchedulingSubpartDetail(String accessKey);
	
	@DefaultMessage("Commit changes to database (Alt+{0})")
	String titleUpdatePreferences(String accessKey);
	
	@DefaultMessage("Delete all Class Preferences. Preferences will be inherited from the subpart (Alt+{0})")
	String titleClearClassPreferences(String accessKey);
	
	@DefaultMessage("Delete all Subpart Preferences (Alt+{0})")
	String titleClearSubpartPreferences(String accessKey);
	
	@DefaultMessage("Delete all Instructor Preferences (Alt+{0})")
	String titleClearInstructorPreferences(String accessKey);
	
	@DefaultMessage("Add Time Pattern Preference (Alt+{0})")
	String titleAddTimePreference(String accessKey);
	
	@DefaultMessage("Remove Time Pattern")
	String titleRemoveTimePattern();
	
	@DefaultMessage("Add Room Group Preference (Alt+{0})")
	String titleAddRoomGroupPreference(String accessKey);
	
	@DefaultMessage("Remove Room Group Preference")
	String titleRemoveRoomGroupPreference();
	
	@DefaultMessage("Add Room Preference (Alt+{0})")
	String titleAddRoomPreference(String accessKey);
	
	@DefaultMessage("Remove Room Preference")
	String titleRemoveRoomPreference();
	
	@DefaultMessage("Add Building Preference (Alt+{0})")
	String titleAddBuildingPreference(String accessKey);
	
	@DefaultMessage("Remove Building Preference")
	String titleRemoveBuildingPreference();
	
	@DefaultMessage("Add Room Feature Preference (Alt+{0})")
	String titleAddRoomFeaturePreference(String accessKey);
	
	@DefaultMessage("Remove Room Feature Preference")
	String titleRemoveRoomFeaturePreference();
	
	@DefaultMessage("Remove Distribution Preference")
	String titleRemoveDistributionPreference();
	
	@DefaultMessage("Delete Configuration (Alt+{0})")
	String titleDeleteConfiguration(String accessKey);
	
	@DefaultMessage("Save Examination (Alt+{0})")
	String titleSaveExamination(String accessKey);
	
	@DefaultMessage("Save Configuration (Alt+{0})")
	String titleSaveConfiguration(String accessKey);
	
	@DefaultMessage("Add Instructor (Alt+{0})")
	String titleAddInstructor(String accessKey);
	
	@DefaultMessage("Remove Instructor")
	String titleRemoveInstructor();
	
	@DefaultMessage("Add Examination (Alt+{0})")
	String titleAddExamination(String accessKey);
	
	@DefaultMessage("Edit Scheduling Supbart (Alt+{0})")
	String titleEditSubpart(String accessKey);
	
	@DefaultMessage("Delete all Class Preferences. Preferences will be inherited from the subpart.")
	String titleClearClassPreferencesOnSubpart();

	@DefaultMessage("Add the selected instructional type to the configuration (Alt+{0})")
	String titleAddInstructionalTypeToConfig(String accessKey);
	
	@DefaultMessage("Add course offering to the instructional offering (Alt+{0})")
	String titleAddCourseToCrossList(String accessKey);
	
	@DefaultMessage("Move to Child Level")
	String titleMoveToChildLevel();
	
	@DefaultMessage("Move to Parent Level")
	String titleMoveToParentLevel();
	
	@DefaultMessage("Delete Instructional Type")
	String titleDeleteInstructionalType();		
	
	@DefaultMessage("Back to Instructional Offering List (Alt+{0})")
	String titleBackToIOList(String accessKey);
	
	@DefaultMessage("Limits do not match")
	String titleCrossListsLimitsDoNotMatch();
	
	@DefaultMessage("Remove course from instructional offering & mark it as not offered.")
	String titleRemoveCourseFromCrossList();
	
	@DefaultMessage("Add Coordinator (Alt+{0})")
	String titleAddCoordinator(String accessKey);

	@DefaultMessage("Course numbers can be specified using wildcard (*). E.g. 2*")
	String tooltipCourseNumber();
	
	@DefaultMessage("Subject Area")
	String labelSubjectArea();
	
	@DefaultMessage("No records matching the search criteria were found.")
	String errorNoRecords();
	
	@DefaultMessage("Instructional Offerings")
	String labelInstructionalOfferings();
	
	@DefaultMessage("Unable to create PDF file.")
	String errorUnableToCreatePdf();
	
	@DefaultMessage("Unable to create worksheet PDF file: nothing to export.")
	String errorUnableToCreateWorksheetPdfNoData();

	@DefaultMessage("Unable to create worksheet PDF file: {0}.")
	String errorUnableToCreateWorksheetPdf(String reason);
	
	@DefaultMessage("Course Number cannot be matched to regular expression: {0}. Reason: {1}")
	String errorCourseDoesNotMatchRegEx(String regEx, String reason);
	
	@DefaultMessage("Access Denied.")
	String errorAccessDenied();

	@DefaultMessage("ERRORS")
	String errorsClassDetail();
	
	@DefaultMessage("ERRORS")
	String errorsSubpartDetail();
	
	@DefaultMessage("ERRORS")
	String errorsClassEdit();
	
	@DefaultMessage("ERRORS")
	String errorsSubpartEdit();
	
	@DefaultMessage("ERRORS")
	String errorsConfigurationEdit();
	
	@DefaultMessage("ERRORS")
	String errorsCourseOfferingEdit();
	
	@DefaultMessage("ERRORS")
	String errorsIOCrossLists();
	
	@DefaultMessage("Invalid room group: Check for duplicate / blank selection. ")
	String errorInvalidRoomGroup();
	
	@DefaultMessage("Invalid room group level. ")
	String errorInvalidRoomGroupLevel();
	
	@DefaultMessage("Invalid building preference: Check for duplicate / blank selection. ")
	String errorInvalidBuildingPreference();
	
	@DefaultMessage("Invalid building preference level. ")
	String errorInvalidBuildingPreferenceLevel();
	
	@DefaultMessage("Invalid distribution preference: Check for duplicate / blank selection. ")
	String errorInvalidDistributionPreference();

	@DefaultMessage("Invalid distribution preference level.")
	String errorInvalidDistributionPreferenceLevel();
	
	@DefaultMessage("Invalid room feature preference: Check for duplicate / blank selection. ")
	String errorInvalidRoomFeaturePreference();
	
	@DefaultMessage("Invalid room feature preference level. ")
	String errorInvalidRoomFeaturePreferenceLevel();

	@DefaultMessage("Invalid instructor preference: Check for duplicate / blank selection. ")
	String errorInvalidInstructorPreference();
	
	@DefaultMessage("Time pattern not selected. ")
	String errorTimePatternNotSelected();
	
	@DefaultMessage("Invalid room preference: Check for duplicate / blank selection. ")
	String errorInvalidRoomPreference();
	
	@DefaultMessage("Invalid room preference level. ")
	String errorInvalidRoomPreferenceLevel();
	
	@DefaultMessage("Null Operation not supported.")
	String errorNullOperationNotSupported();
	
	@DefaultMessage("Class Info not supplied.")
	String errorClassInfoNotSupplied();
	
	@DefaultMessage("Subpart Info not supplied.")
	String errorSubpartInfoNotSupplied();
	
	@DefaultMessage("Number of Rooms cannot be less than 0.")
	String errorNumberOfRoomsNegative();
	
	@DefaultMessage("Room Ratio cannot be less than 0.")
	String errorRoomRatioNegative();
	
	@DefaultMessage("Minimum Expected Capacity cannot be less than 0.")
	String errorMinimumExpectedCapacityNegative();

	@DefaultMessage("Maximum Expected Capacity cannot be less than 0.")
	String errorMaximumExpectedCapacityNegative();

	@DefaultMessage("Maximum Expected Capacity cannot be less than Minimum Expected Capacity.")
	String errorMaximumExpectedCapacityLessThanMinimum();

	@DefaultMessage("Class Owner is required.")
	String errorRequiredClassOwner();

	@DefaultMessage("Notes to schedule manager cannot exceed 999 characters.")
	String errorNotesLongerThan999();
	
	@DefaultMessage("Schedule print note cannot exceed 1999 characters.")
	String errorSchedulePrintNoteLongerThan1999();
	
	@DefaultMessage("Required room {0} (capacity: {1}) cannot accommodate this class (capacity: {2})")
	String errorRequiredRoomTooSmall(String room, int roomCapacity, int requiredCapacity);
	
	@DefaultMessage("User temporarily locked out - Exceeded maximum failed login attempts.")
	String errorUserTemporarilyLockedOut();
	
	@DefaultMessage("Authentication failed")
	String errorAuthenticationFailed();
	
	@DefaultMessage("Operation could not be interpreted: ")
	String errorOperationNotInterpreted();
	
	@DefaultMessage("Course Offering data was not correct: ")
	String errorCourseDataNotCorrect();
	
	@DefaultMessage("Config ID is not valid: ")
	String errorConfigIDNotValid();
	
	@DefaultMessage("Course Number is required.")
	String errorCourseNumberRequired();
	
	@DefaultMessage("Course Number cannot be matched to regular expression: {0} . Reason: {1}")
	String errorCourseNumberCannotBeMatched(String regularExpression, String reason);
	
	@DefaultMessage("The course cannot be renamed. A course with the same course number already exists.")
	String errorCourseCannotBeRenamed();
	
	@DefaultMessage("Reserved spaces should total to at least the limit")
	String errorCrossListsLimitsDoNotMatch();
	
	@DefaultMessage("Course Offering is required.")
	String errorRequiredCourseOffering();
	
	@DefaultMessage("Controlling Course is required")
	String errorRequiredControllingCourse();
	
	@DefaultMessage("Reserved Space is required")
	String errorRequiredReservedSpace();
	
	@DefaultMessage("Unique Id needed for operation. ")
	String errorUniqueIdNeeded();
	
	@DefaultMessage("Name")
	String sortByName();
	
	@DefaultMessage("External Id")
	String sortByDivSec();
	
	@DefaultMessage("Enrollment")
	String sortByEnrollment();
	
	@DefaultMessage("Limit")
	String sortByLimit();

	@DefaultMessage("Room Size")
	String sortByRoomSize();

	@DefaultMessage("Date Pattern")
	String sortByDatePattern();

	@DefaultMessage("Time Pattern")
	String sortByTimePattern();

	@DefaultMessage("Instructor")
	String sortByInstructor();

	@DefaultMessage("Assigned Time")
	String sortByAssignedTime();

	@DefaultMessage("Assigned Room")
	String sortByAssignedRoom();

	@DefaultMessage("Assigned Room Capacity")
	String sortByAssignedRoomCapacity();

	@DefaultMessage("Classes ({0})")
	String backClasses(String classes);
	
	@DefaultMessage("Class ({0})")
	String backClass(String className);

	@DefaultMessage("Scheduling Subpart ({0})")
	String backSubpart(String subpartName);
	
	@DefaultMessage("Instructional Offering ({0})")
	String backInstructionalOffering(String ioName);
	
	@DefaultMessage("am")
	String timeAm();
	
	@DefaultMessage("pm")
	String timePm();
	
	@DefaultMessage("Class Assignment")
	String dialogClassAssignment();
	
	@DefaultMessage("Timetable")
	String sectionTitleTimetable();
	
	@DefaultMessage("Preferences")
	String sectionTitlePreferences();
	
	@DefaultMessage("Time Preferences")
	String sectionTitleTimePreferences();
	
	@DefaultMessage("Room Group Preferences")
	String sectionTitleRoomGroupPreferences();
	
	@DefaultMessage("Room Preferences")
	String sectionTitleRoomPreferences();
	
	@DefaultMessage("Building Preferences")
	String sectionTitleBuildingPreferences();
	
	@DefaultMessage("Room Feature Preferences")
	String sectionTitleRoomFeaturePreferences();
	
	@DefaultMessage("Examination Period Preferences")
	String sectionTitleExaminationPeriodPreferences();
	
	@DefaultMessage("Distribution Preferences")
	String sectionTitleDistributionPreferences();
	
	@DefaultMessage("Instructors")
	String sectionTitleInstructors();
	
	@DefaultMessage("Requests / Notes to Schedule Manager")
	String sectionTitleNotesToScheduleManager();
	
	@DefaultMessage("Classes")
	String sectionTitleClasses();
	
	@DefaultMessage("Examinations")
	String sectionTitleExaminations();

	@DefaultMessage("Examination")
	String sectionTitleExamination();
	
	@DefaultMessage("Instructor Displayed")
	String titleInstructorDisplayed();
	
	@DefaultMessage("Instructor Not Displayed")
	String titleInstructorNotDisplayed();	
	
	@DefaultMessage("Displayed in Schedule Book")
	String titleDisplayedInScheduleBook();

	@DefaultMessage("Not Displayed in Schedule Book")
	String titleNotDisplayedInScheduleBook();
	
	@DefaultMessage("Are you sure you want to set room size to a value different from expected capacity? Continue?")
	String confirmRoomSizeDifferentFromCapacity();
	
	@DefaultMessage("Do you want to apply instructor preferences to this class?")
	String confirmApplyInstructorPreferencesToClass();
	
	@DefaultMessage("Do you want to remove any instructor preferences \\nthat may have been applied to this class?")
	String confirmRemoveInstructorPreferencesFromClass();
	
	@DefaultMessage("Do you really want to clear all class preferences?")
	String confirmClearAllClassPreferences();
	
	@DefaultMessage("This will create {0} classes. Continue?")
	String confirmCreateTooManyClasses();
	
	@DefaultMessage("This operation may result in deletion of existing subparts/classes . Continue?")
	String confirmMayDeleteSubpartsClasses();
	
	@DefaultMessage("This operation will delete existing subparts and associated classes . Continue?")
	String confirmDeleteExistingSubpartsClasses();
	
	@DefaultMessage("Select an instructor")
	String alertSelectAnInstructor();

	@DefaultMessage("More Options &gt;&gt;&gt;")
	String selectMoreOptions();
	
	@DefaultMessage("&lt;&lt;&lt; Less Options")
	String selectLessOptions();
	
	@DefaultMessage("If checked, spread in time constraint will be automatically posted between classes of this subpart.")
	String descriptionAutomaticSpreadInTime();
	
	@DefaultMessage("If checked, students will be allowed to take classes from this subpart even when they are overlapping with other classes.")
	String descriptionStudentOverlaps();
	
	@DefaultMessage("Only course offerings that are not offered can be added into a cross-list.")
	String hintCrossLists();
	
	@DefaultMessage("If checked, only students meeting reservations will be allowed to enroll into the offering.")
	String descriptionByReservationOnly();
}