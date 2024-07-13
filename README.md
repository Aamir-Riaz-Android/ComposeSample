# ComposeSample
 Formatting is required for better responsiveness and readability
 used lazyColum instead of recyclerview , because it's more aligned with the Android jetpack compose
 There is no need to use room Db as a shared viewmodel is used plus the response of the API can be cached until the lifecycle of the application
 added BaseUrl in the appConstant file the better approach is to add it to the BuildConfig file and based on flavors like Staging|Production it can be modified inside the 
 network hilt module
 used Feature-based architecture layer pattern for this sample project because it is easy to read and debug code instead of, domain, repository, presentation etc layers
 Feel free to reach me out on Linked In for any assistance or questions  **https://www.linkedin.com/in/android-app-developer-aamir**
