package com.proxy;

public class WebPageProxy implements IWebPage {
  WebPageImpl webPage;

  WebPageProxy() {
    webPage = new WebPageImpl();
  }

  @Override
  public void load(String url) throws Exception {
    if (url.contains("youtube")) {
      throw new Exception("not allowed " + url);
    }

    webPage.load(url);
  }
}
