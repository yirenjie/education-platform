package com.little.edu.appsdk.bean;


import com.little.edu.appsdk.util.json.WxMaGsonBuilder;

/**
 * 微信二维码（小程序码）包装器.
 *
 * @author Element
 */
public abstract class AbstractWxMaQrcodeWrapper {
  public String toJson() {
    return WxMaGsonBuilder.create().toJson(this);
  }

  @Override
  public String toString() {
    return this.toJson();
  }
}
