sts899
======

Test app for Stripes STS-899

Run the app :

    $> mvn clean jetty:run-exploded

Open your browser to :

http://localhost:8080/sts899/zip/DownloadZip.action/Len%25ovo.zip

Stack :

```
java.lang.IllegalArgumentException: URLDecoder: Illegal hex characters in escape (%) pattern - For input string: "ov"
  at java.net.URLDecoder.decode(URLDecoder.java:173)
	at net.sourceforge.stripes.util.StringUtil.urlDecode(StringUtil.java:90)
	at net.sourceforge.stripes.util.HttpUtil.getRequestedPath(HttpUtil.java:59)
	at net.sourceforge.stripes.controller.StripesFilter.doFilter(StripesFilter.java:220)
	at net.sourceforge.stripes.controller.DynamicMappingFilter.doFilter(DynamicMappingFilter.java:418)
```

Note that the same exception is thrown with Tomcat7. 
