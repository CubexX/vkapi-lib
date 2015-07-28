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

public class Pages {
    public static String get(String params) {
        // http://vk.com/dev/pages.get
        return Vk.query("pages.get", params);
    }


    public static String save(String params) {
        // http://vk.com/dev/pages.save
        return Vk.query("pages.save", params);
    }


    public static String saveAccess(String params) {
        // http://vk.com/dev/pages.saveAccess
        return Vk.query("pages.saveAccess", params);
    }


    public static String getHistory(String params) {
        // http://vk.com/dev/pages.getHistory
        return Vk.query("pages.getHistory", params);
    }


    public static String getTitles(String params) {
        // http://vk.com/dev/pages.getTitles
        return Vk.query("pages.getTitles", params);
    }


    public static String getVersion(String params) {
        // http://vk.com/dev/pages.getVersion
        return Vk.query("pages.getVersion", params);
    }


    public static String parseWiki(String params) {
        // http://vk.com/dev/pages.parseWiki
        return Vk.query("pages.parseWiki", params);
    }


    public static String clearCache(String params) {
        // http://vk.com/dev/pages.clearCache
        return Vk.query("pages.clearCache", params);
    }
}
