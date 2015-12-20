/*
 * Copyright (c) 2015 Zetra.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package id.zelory.benihtes.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import butterknife.Bind;
import id.zelory.benih.ui.fragment.BenihFragment;
import id.zelory.benihtes.R;

/**
 * Created by zetbaitsu on 7/12/15.
 */
public class MyFragment extends BenihFragment {
    private String data;
    @Bind(R.id.text) TextView textView;

    @Override
    protected int getResourceLayout() {
        return R.layout.fragment_my;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    protected void onViewReady(@Nullable Bundle savedInstanceState) {
        textView.setText(data);
    }

    @Override
    public void onDestroy() {
        data = null;
        super.onDestroy();
    }
}
