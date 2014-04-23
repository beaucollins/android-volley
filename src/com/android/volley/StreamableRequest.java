package com.android.volley;

import java.io.InputStream;

public interface StreamableRequest {

    public InputStream getBodyStream();

}