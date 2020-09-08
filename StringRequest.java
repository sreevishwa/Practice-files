StringRequest stringRequest = new StringRequest(Request.Method.POST, URL,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String ServerResponse) {
            //statements...
          }
        },
        new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError volleyError) {
            Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_SHORT)
                .show();
            Log.d("VOLLEY", volleyError.toString());
          }
        }) {
      @Override
      protected Map<String, String> getParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("key", value);
        return params;
      }

    };
    VolleySingleton.getInstance(this).addToRequestQueue(stringRequest);
