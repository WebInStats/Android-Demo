/*
 * Copyright (c) 2017. Truiton (http://www.truiton.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 * Mohit Gupt (https://github.com/mohitgupt)
 *
 */

package com.truiton.bottomnavigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.HashMap;
import java.util.Map;

import webinstats.android_wis_144.Webinstats;

public class ItemOneFragment extends Fragment {
    Webinstats wiso = new Webinstats("//wisdemo.webinstats.com/","1481","0");
    public static ItemOneFragment newInstance() {
        ItemOneFragment fragment = new ItemOneFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Map<String,String> map=new HashMap<>();
        map.put("a", "a");
        map.put("ls", "|");
        map.put("ps", "/");
        map.put("p","Fragment1");
        map.put("_cstto","1440");
        map.put("_csttoi","60");
        wiso.execute(getActivity(),map);
        return inflater.inflate(R.layout.fragment_item_one, container, false);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        wiso.onChangeState(getActivity());

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        wiso.onChangeState(getActivity());
    }
}
