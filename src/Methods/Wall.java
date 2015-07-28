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

public class Wall {
    public static String get(String params) {
        // http://vk.com/dev/wall.get
        return Vk.query("wall.get", params);
    }


    public static String search(String params) {
        // http://vk.com/dev/wall.search
        return Vk.query("wall.search", params);
    }


    public static String getById(String params) {
        // http://vk.com/dev/wall.getById
        return Vk.query("wall.getById", params);
    }


    public static String post(String params) {
        // http://vk.com/dev/wall.post
        return Vk.query("wall.post", params);
    }


    public static String repost(String params) {
        // http://vk.com/dev/wall.repost
        return Vk.query("wall.repost", params);
    }


    public static String getReposts(String params) {
        // http://vk.com/dev/wall.getReposts
        return Vk.query("wall.getReposts", params);
    }


    public static String edit(String params) {
        // http://vk.com/dev/wall.edit
        return Vk.query("wall.edit", params);
    }


    public static String delete(String params) {
        // http://vk.com/dev/wall.delete
        return Vk.query("wall.delete", params);
    }


    public static String restore(String params) {
        // http://vk.com/dev/wall.restore
        return Vk.query("wall.restore", params);
    }


    public static String pin(String params) {
        // http://vk.com/dev/wall.pin
        return Vk.query("wall.pin", params);
    }


    public static String unpin(String params) {
        // http://vk.com/dev/wall.unpin
        return Vk.query("wall.unpin", params);
    }


    public static String getComments(String params) {
        // http://vk.com/dev/wall.getComments
        return Vk.query("wall.getComments", params);
    }


    public static String addComment(String params) {
        // http://vk.com/dev/wall.addComment
        return Vk.query("wall.addComment", params);
    }


    public static String editComment(String params) {
        // http://vk.com/dev/wall.editComment
        return Vk.query("wall.editComment", params);
    }


    public static String deleteComment(String params) {
        // http://vk.com/dev/wall.deleteComment
        return Vk.query("wall.deleteComment", params);
    }


    public static String restoreComment(String params) {
        // http://vk.com/dev/wall.restoreComment
        return Vk.query("wall.restoreComment", params);
    }


    public static String reportPost(String params) {
        // http://vk.com/dev/wall.reportPost
        return Vk.query("wall.reportPost", params);
    }


    public static String reportComment(String params) {
        // http://vk.com/dev/wall.reportComment
        return Vk.query("wall.reportComment", params);
    }
}
