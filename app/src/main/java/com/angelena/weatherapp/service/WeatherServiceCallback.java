package com.angelena.weatherapp.service;

import java.nio.channels.Channel;

public interface WeatherServiceCallback {

    //void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);

    void serviceSuccess(com.angelena.weatherapp.data.Channel channel);
}
