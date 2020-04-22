/*
 * Copyright(c) 2020 taofen8.com. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License.
 */

package com.taofen8.mid.kong.dispatch.handler;

/**
 * Intecepting request body aims to handle  codec ， compress etc. before transforming to {@link KongRequest#requestBody}
 * which  has been not set in this phase
 */
public interface RequestBodyIntercepter {

  byte[] intercept(byte[] bytesOfBody, KongRequest request);
}
