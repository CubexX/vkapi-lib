package Utils;

/*
#
# Copyright (c) 2015 Alexander Rizaev
#
# Permission is hereby granted, free of charge, to any person obtaining
# a copy of this software and associated documentation files (the
# "Software"), to deal in the Software without restriction, including
# without limitation the rights to use, copy, modify, merge, publish,
# distribute, sublicense, and/or sell copies of the Software, and to
# permit persons to whom the Software is furnished to do so, subject to
# the following conditions:
#
# The above copyright notice and this permission notice shall be
# included in all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
# EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
# MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
# NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
# LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
# OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
# WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
#
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Requests {
    public static String post(String req_url, String params) {
        try {
            URL url = new URL(req_url);
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());

            writer.write(params);
            writer.flush();
            String inputLine;
            String result = "";
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            while ((inputLine = reader.readLine()) != null) {
                result += inputLine;
            }
            writer.close();
            reader.close();

            return result;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "fail";
    }

    public static String get(String req_url) {
        try {
            URL url = new URL(req_url);
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);

            String inputLine;
            String result = "";
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            while ((inputLine = reader.readLine()) != null) {
                result += inputLine;
            }
            reader.close();

            return result;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "fail";
    }
}