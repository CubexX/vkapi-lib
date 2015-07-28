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

public class Polls {
    public static String getById(String params) {
        // http://vk.com/dev/polls.getById
        return Vk.query("polls.getById", params);
    }


    public static String addVote(String params) {
        // http://vk.com/dev/polls.addVote
        return Vk.query("polls.addVote", params);
    }


    public static String deleteVote(String params) {
        // http://vk.com/dev/polls.deleteVote
        return Vk.query("polls.deleteVote", params);
    }


    public static String getVoters(String params) {
        // http://vk.com/dev/polls.getVoters
        return Vk.query("polls.getVoters", params);
    }


    public static String create(String params) {
        // http://vk.com/dev/polls.create
        return Vk.query("polls.create", params);
    }


    public static String edit(String params) {
        // http://vk.com/dev/polls.edit
        return Vk.query("polls.edit", params);
    }
}
