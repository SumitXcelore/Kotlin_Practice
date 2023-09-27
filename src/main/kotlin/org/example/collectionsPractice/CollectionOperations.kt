package org.example.collectionsPractice

import org.example.dataset.Course
import org.example.dataset.CourseCategory
import org.example.dataset.KAFKA
import org.example.dataset.courseList
import java.util.function.Predicate

fun main(){
    val courseList = courseList()
    //exploreFilter(courseList)
 //   val devpredicate = {c:Course->c.category==CourseCategory.DEVELOPEMENT}
    val bsPredicate ={
        c:Course->c.category==CourseCategory.BUSINESS
    }
   // exploreFilter1(courseList,devpredicate)//same output as exploreFilter But no hard Coding
    exploreFilter1(courseList,bsPredicate) //same function can be called with a different predicate for different result


    println(exploreFlatMap(courseList, KAFKA));
}




fun exploreFlatMap(courseList: MutableList<Course>,kafka:String) :List<String>{
    val kafkaCourses=courseList.flatMap { course-> val courseName=course.name
    course.topicsCovered.filter { it== KAFKA }
            .map { courseName }}

    return kafkaCourses

}




fun exploreFilter(courseList: MutableList<Course>) {
    val developmentCourses=courseList.filter {
        it.category==CourseCategory.DEVELOPEMENT
    }.forEach { println("$it") }



}



fun exploreFilter1(courseList: MutableList<Course>,predicate: (Course)->Boolean) {
  courseList.filter {predicate.invoke(it)

    }.forEach { println("$it") }   //more generic



}
