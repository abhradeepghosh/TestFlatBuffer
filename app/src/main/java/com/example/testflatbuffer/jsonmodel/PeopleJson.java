/*
 *    Copyright (C) 2016 Amit Shekhar
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.example.testflatbuffer.jsonmodel;

import java.util.ArrayList;

public class PeopleJson {
    public String id;
    public long index;
    public String guid;
    public String name;
    public String gender;
    public String company;
    public String email;
    public ArrayList<FriendJson> friends;

}
