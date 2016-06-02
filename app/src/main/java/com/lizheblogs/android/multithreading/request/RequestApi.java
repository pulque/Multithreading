/*
 * Copyright 2016 Li Zhe <pulqueli@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lizheblogs.android.multithreading.request;

/**
 * https://developer.android.com/training/volley/index.html
 * Base Request Class
 * Created by Norman.Li on 6/2/2016.
 */
public class RequestApi {
    private static final String TAG = "Request";
    private static final int socketTimeout = 60000;

//    public static void RequestJson(final Context context, int method, AbstractReq msg, final RequestCallBack mCallBack) {
//        if (activity == null || activity.isFinishing()) {
//            if (context == null)
//                return;
//        }
//        final HttpRsp httpRes = new HttpRsp();
//        if (context != null) {
//            if (!NetworkUtil.isOnline(context)) {
//                httpRes.setIsException(true);
//                httpRes.setStatus(Constants.NO_NETWORK_498);
//                httpRes.setMessage(context.getString(R.string.no_internet));
//                if (mCallBack != null)
//                    mCallBack.onFailure(httpRes);
//                return;
//            }
//        } else {
//            if (!NetworkUtil.isOnline(activity)) {
//                httpRes.setIsException(true);
//                httpRes.setStatus(Constants.NO_NETWORK_498);
//                httpRes.setMessage(activity.getString(R.string.no_internet));
//                if (mCallBack != null)
//                    mCallBack.onFailure(httpRes);
//                return;
//            }
//        }
//
//        String url = msg.getUri();
//        String msgContent = JacksonConvertUtil.objectToJson(msg);
//        JSONObject mJsonObject = null;
//        if (Request.Method.GET == method) {
//            Slog.e(TAG, "Norman-Content: Request.Method.GET-" + msgContent);
//            url = url + "?json=" + NetworkUtil.URLEncode(msgContent);
//        } else if (Request.Method.POST == method) {
//            Slog.e(TAG, "Norman-Content: Request.Method.POST-" + msgContent);
//            if (!TextUtils.isEmpty(msgContent)) {
//                try {
//                    mJsonObject = new JSONObject(msgContent);
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        // pass second argument as "null" for GET requests
//        JsonObjectRequest req = new JsonObjectRequest(method, url, mJsonObject,
//                new Response.Listener<JSONObject>() {
//
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        Slog.longShow(TAG, "Norman-Response: " + response.toString());
//                        if (context == null) {
//                            if (activity.isFinishing())
//                                return;
//                        }
//                        if (mCallBack != null)
//                            mCallBack.onSuccess(response.toString());
//
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                if (context != null) {
//                    httpRes.setMessage(VolleyErrorHelper.getMessage(error, context));
//                } else {
//                    httpRes.setMessage(VolleyErrorHelper.getMessage(error, activity));
//                }
//                if (error.networkResponse != null)
//                    httpRes.setStatus(error.networkResponse.statusCode);
//                httpRes.setIsException(true);
//                Slog.e("Norman-Response-Error: ", httpRes.getStatus() + "-" + httpRes.getMessage());
//                if (context == null) {
//                    if (activity.isFinishing())
//                        return;
//                }
//                if (mCallBack != null)
//                    mCallBack.onFailure(httpRes);
//            }
//        }) {
//            @Override
//            public Map<String, String> getHeaders() throws AuthFailureError {
//                HashMap<String, String> map = new HashMap<String, String>();
//                map.put("Content-type", "application/json");
//                map.put("Accept-Language", "en_US");
//                map.put("Timezone", Util.getTimeZoneName());
//                String access_token;
//                if (context != null) {
//                    access_token = AuthenticatedDao.readToken(context);
//                } else {
//                    access_token = AuthenticatedDao.readToken(activity);
//                }
//
//                if (isAuthorization && !TextUtils.isEmpty(access_token)) {
//                    map.put("Authorization", "Bearer " + access_token);
//                }
//                return map;
//
//            }
//        };
//
//
//        DefaultRetryPolicy policy = new DefaultRetryPolicy(socketTimeout, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
//
//        req.setRetryPolicy(policy);
//        Slog.e(TAG, "Norman-Request: " + url);
//        // add the request object to the queue to be executed
//        AppApplication.getInstance().addToRequestQueue(req);
//    }
//
//    public static void cancelAll() {
//        Slog.e(TAG, "Norman-Request: cancelAll");
//        AppApplication.getInstance().cancelAllPendingRequests();
//    }

}
