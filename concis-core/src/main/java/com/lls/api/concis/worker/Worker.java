package com.lls.api.concis.worker;

/************************************
 * Worker
 * @author liliangshan
 * @date 2018/12/22
 ************************************/
public interface Worker {

  void start();

  void stop();

  void destroy();

  void isStarted();

  void isStopped();

}
