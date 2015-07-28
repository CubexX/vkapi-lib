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

public class Docs {
    public static String get(String params) {
        // http://vk.com/dev/docs.get
        return Vk.query("docs.get", params);
    }


    public static String getById(String params) {
        // http://vk.com/dev/docs.getById
        return Vk.query("docs.getById", params);
    }


    public static String getUploadServer(String params) {
        // http://vk.com/dev/docs.getUploadServer
        return Vk.query("docs.getUploadServer", params);
    }


    public static String getWallUploadServer(String params) {
        // http://vk.com/dev/docs.getWallUploadServer
        return Vk.query("docs.getWallUploadServer", params);
    }


    public static String save(String params) {
        // http://vk.com/dev/docs.save
        return Vk.query("docs.save", params);
    }


    public static String delete(String params) {
        // http://vk.com/dev/docs.delete
        return Vk.query("docs.delete", params);
    }


    public static String add(String params) {
        // http://vk.com/dev/docs.add
        return Vk.query("docs.add", params);
    }
}
