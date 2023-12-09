# MiniDaggerDemo
Using,
- Kotlin
- Viewbinding
- Dagger:
	-  Dagger is one of the DI libraries that is created by "Square" and maintaining by Google.
	-  It is managing and creating graph of dependencies for you.
	- Ease of unit test and reusable code.

simple dagger demo with Application class.
- Intention to made this tutorial to help you who wants to take the baby step to learn dagger in kotlin :-) 
- In this examle how to set up dagger in your Android project from the scratch.
- How to impement Dagger into Project?
  
 	- Add plugin into App -> build.gradle file, add this line
    	
    		 plugins {
    			    id 'kotlin-kapt'
    			 }
 
	- Add dagger dependency App -> build.gradle file
   
   		  dependencies {
       		  -------
        	 // Dependency injection
      		 implementation "com.google.dagger:dagger:2.42"
       		 kapt "com.google.dagger:dagger-compiler:2.42"
   	       }
   	 - Use updated dagger version.

