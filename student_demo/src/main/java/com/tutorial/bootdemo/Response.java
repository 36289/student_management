package com.tutorial.bootdemo;

public class Response <T>{
  private T data;
  private boolean success;
  private String erroMag;
  public static <K> Response <K> newSuccess(K data){
    Response<K> response=new Response<>();
    response.setData(data);
    response.setSuccess(true);
    return response;
  }
  public static Response<Void> newFail(String erroMag){
  Response<Void> response=new Response<>();
  response.setErroMag(erroMag);
  response.setSuccess(false);
  return response;
  }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getErroMag() {
        return erroMag;
    }

    public void setErroMag(String erroMag) {
        this.erroMag = erroMag;
    }
  
}
