package com.example.fouryou;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;


public class rec_TagRequest extends StringRequest {
    final static private String URL = "http://hyeonseo0457.dothome.co.kr/Tag.php"; // 서버 URL
    private Map<String, String> map;

    public rec_TagRequest(String userEmail, String selectedDate, Response.Listener<String> listener, Response.ErrorListener volleyError) {
        super(Request.Method.POST, URL, listener, volleyError);

        map = new HashMap<>();
        map.put("userEmail", userEmail); // 수정된 부분: 키 값을 소문자로 변경
        map.put("diaryDate", selectedDate); // 수정된 부분: 키 값을 소문자로 변경
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}