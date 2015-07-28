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

public class Database {
    public static String getCountries(String params) {
        // http://vk.com/dev/database.getCountries
        return Vk.query("database.getCountries", params);
    }

    public static String getRegions(String params) {
        // http://vk.com/dev/database.getRegions
        return Vk.query("database.getRegions", params);
    }

    public static String getStreetsById(String params) {
        // http://vk.com/dev/database.getStreetsById
        return Vk.query("database.getStreetsById", params);
    }

    public static String getCountriesById(String params) {
        // http://vk.com/dev/database.getCountriesById
        return Vk.query("database.getCountriesById", params);
    }

    public static String getCities(String params) {
        // http://vk.com/dev/database.getCities
        return Vk.query("database.getCities", params);
    }

    public static String getCitiesById(String params) {
        // http://vk.com/dev/database.getCitiesById
        return Vk.query("database.getCitiesById", params);
    }

    public static String getUniversities(String params) {
        // http://vk.com/dev/database.getUniversities
        return Vk.query("database.getUniversities", params);
    }

    public static String getSchools(String params) {
        // http://vk.com/dev/database.getSchools
        return Vk.query("database.getSchools", params);
    }

    public static String getSchoolClasses(String params) {
        // http://vk.com/dev/database.getSchoolClasses
        return Vk.query("database.getSchoolClasses", params);
    }

    public static String getFaculties(String params) {
        // http://vk.com/dev/database.getFaculties
        return Vk.query("database.getFaculties", params);
    }

    public static String getChairs(String params) {
        // http://vk.com/dev/database.getChairs
        return Vk.query("database.getChairs", params);
    }
}
