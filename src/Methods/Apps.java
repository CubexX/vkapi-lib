package Methods;

/*
#
# Copyright (c) 2015 Alexey Miroshnichenko
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

import VKontakte.Vk;

public class Apps {
    public static String getCatalog(String params) {
        // http://vk.com/dev/apps.getCatalog
        return Vk.query("apps.getCatalog", params);
    }


    public static String get(String params) {
        // http://vk.com/dev/apps.get
        return Vk.query("apps.get", params);
    }


    public static String sendRequest(String params) {
        // http://vk.com/dev/apps.sendRequest
        return Vk.query("apps.sendRequest", params);
    }


    public static String deleteAppRequests(String params) {
        // http://vk.com/dev/apps.deleteAppRequests
        return Vk.query("apps.deleteAppRequests", params);
    }


    public static String getFriendsList(String params) {
        // http://vk.com/dev/apps.getFriendsList
        return Vk.query("apps.getFriendsList", params);
    }
}
