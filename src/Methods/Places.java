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

public class Places {
    public static String add(String params) {
        // http://vk.com/dev/places.add
        return Vk.query("places.add", params);
    }


    public static String getById(String params) {
        // http://vk.com/dev/places.getById
        return Vk.query("places.getById", params);
    }


    public static String search(String params) {
        // http://vk.com/dev/places.search
        return Vk.query("places.search", params);
    }


    public static String checkin(String params) {
        // http://vk.com/dev/places.checkin
        return Vk.query("places.checkin", params);
    }


    public static String getCheckins(String params) {
        // http://vk.com/dev/places.getCheckins
        return Vk.query("places.getCheckins", params);
    }


    public static String getTypes(String params) {
        // http://vk.com/dev/places.getTypes
        return Vk.query("places.getTypes", params);
    }
}
