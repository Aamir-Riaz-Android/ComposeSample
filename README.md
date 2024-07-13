# ComposeSample
# Formatting is required for better responsiveness and readibility
# used lazyColum instead of recyclerview , because its more aligned with Android jetpack compose
# No need to use room Db as shared viewmodel is used plus the response of the api can be cached untill the lifecycle of the application
# added BaseUrl in the appConstant file the better approach is to add it to the BuildConfig file and based on flavors like Staging|Production it can be modified inside network #hilt module
#used Feature based architecture layer pattern for this sample project because its easy to read and debug code instead of, domain, repository, presentation etc layers
#Feel free to reach me out on linkedIn for any assistance or questions  **https://www.linkedin.com/in/android-app-developer-aamir**
