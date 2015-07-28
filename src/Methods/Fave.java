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

public class Fave {
    public static String getUsers(String params) {
        // http://vk.com/dev/fave.getUsers
        return Vk.query("fave.getUsers", params);
    }


    public static String getPhotos(String params) {
        // http://vk.com/dev/fave.getPhotos
        return Vk.query("fave.getPhotos", params);
    }


    public static String getPosts(String params) {
        // http://vk.com/dev/fave.getPosts
        return Vk.query("fave.getPosts", params);
    }


    public static String getVideos(String params) {
        // http://vk.com/dev/fave.getVideos
        return Vk.query("fave.getVideos", params);
    }


    public static String getLinks(String params) {
        // http://vk.com/dev/fave.getLinks
        return Vk.query("fave.getLinks", params);
    }


    public static String addUser(String params) {
        // http://vk.com/dev/fave.addUser
        return Vk.query("fave.addUser", params);
    }


    public static String removeUser(String params) {
        // http://vk.com/dev/fave.removeUser
        return Vk.query("fave.removeUser", params);
    }


    public static String addGroup(String params) {
        // http://vk.com/dev/fave.addGroup
        return Vk.query("fave.addGroup", params);
    }


    public static String removeGroup(String params) {
        // http://vk.com/dev/fave.removeGroup
        return Vk.query("fave.removeGroup", params);
    }


    public static String addLink(String params) {
        // http://vk.com/dev/fave.addLink
        return Vk.query("fave.addLink", params);
    }


    public static String removeLink(String params) {
        // http://vk.com/dev/fave.removeLink
        return Vk.query("fave.removeLink", params);
    }
}
