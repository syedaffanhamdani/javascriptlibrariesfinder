# A Basic crawler that
1. Reads the command line arguments
2. performs a google search with it
3. extracts the main links from the first result page
4. Downloads the respective pages and extract the names of Javascript libraries used in them
5. Prints top 5 most used libraries to standard output

## Input
As input you can give search term or a sentence
```
java - jar MY_JAR spring boot
```
This would print the java script libraries found and their usage on console. 

## Sample Output
```$xslt
Number of links extracted 9
library: scheduler.js   occurrence: 1
library: base.js   occurrence: 1
library: gpt.js   occurrence: 2
library: messagingWithoutDetection.js   occurrence: 1
library: ccpa.js   occurrence: 1
library: accountwithtoken?jsonp=_fasttoken&newFollows=true   occurrence: 1
library: digitrust.min.js   occurrence: 1
library: jquery.js?ver=1.12.4-wp   occurrence: 2
library: jquery-migrate.min.js?ver=1.4.1   occurrence: 2
library: cnss.js?ver=1.0   occurrence: 1
library: wp-sc-ajax.js?ver=5.2.2   occurrence: 1
library: addtoany.min.js?ver=1.1   occurrence: 1
library: wonderplugincarouselskins.js?ver=5.2   occurrence: 1
library: wonderplugincarousel.js?ver=5.2   occurrence: 1
library: wpp-4.2.0.min.js?ver=4.2.2   occurrence: 1
library: jquery.sidr.min.js?ver=1.2.1   occurrence: 1
library: catchresponsive-custom-scripts.min.js   occurrence: 1
library: jquery.easing.min.js?ver=5.2.2   occurrence: 1
library: tfa.js   occurrence: 1
library: buttons.js   occurrence: 1
library: -3-ans_frontend-relay-common-27-9747fd4aa8396f77.webpack   occurrence: 1
library: -3-ans_frontend-relay-vendor-27-67fb2554e1202289.webpack   occurrence: 1
library: -3-chunk.web.main.js.out-34-02ac2d3608920ec8.webpack   occurrence: 1
library: vue.min.js   occurrence: 1
library: content.js   occurrence: 1
library: jquery.cookie.min.js?ver=1.4.0   occurrence: 1
library: wp-convertkit.js?ver=1.9.2   occurrence: 1
library: cookie-law-info-public.js?ver=1.8.3   occurrence: 1
library: bootstrap.min.js?ver=1.2   occurrence: 1
library: scripts.js?ver=1.2   occurrence: 1
library: headroom.min.js   occurrence: 1
library: jQuery.headroom.min.js   occurrence: 1


```
