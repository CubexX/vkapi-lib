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

public class Notes {
    public static String get(String params) {
        // http://vk.com/dev/notes.get
        return Vk.query("notes.get", params);
    }


    public static String getById(String params) {
        // http://vk.com/dev/notes.getById
        return Vk.query("notes.getById", params);
    }


    public static String getFriendsNotes(String params) {
        // http://vk.com/dev/notes.getFriendsNotes
        return Vk.query("notes.getFriendsNotes", params);
    }


    public static String add(String params) {
        // http://vk.com/dev/notes.add
        return Vk.query("notes.add", params);
    }


    public static String edit(String params) {
        // http://vk.com/dev/notes.edit
        return Vk.query("notes.edit", params);
    }


    public static String delete(String params) {
        // http://vk.com/dev/notes.delete
        return Vk.query("notes.delete", params);
    }


    public static String getComments(String params) {
        // http://vk.com/dev/notes.getComments
        return Vk.query("notes.getComments", params);
    }


    public static String createComment(String params) {
        // http://vk.com/dev/notes.createComment
        return Vk.query("notes.createComment", params);
    }


    public static String editComment(String params) {
        // http://vk.com/dev/notes.editComment
        return Vk.query("notes.editComment", params);
    }


    public static String deleteComment(String params) {
        // http://vk.com/dev/notes.deleteComment
        return Vk.query("notes.deleteComment", params);
    }


    public static String restoreComment(String params) {
        // http://vk.com/dev/notes.restoreComment
        return Vk.query("notes.restoreComment", params);
    }
}
