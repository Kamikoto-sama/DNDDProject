package com.example.projectapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.projectapplication.ImageViewOnClickHandler.Companion.bodyPictureClickHandle

class ChooseBodyPicturesFragmentTwo : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_choose_body_pictures_fragment_two, null)
        val picture1: ImageView = v.findViewById(R.id.choose_body_picture5)
        val picture2: ImageView = v.findViewById(R.id.choose_body_picture6)
        val picture3: ImageView = v.findViewById(R.id.choose_body_picture7)
        val picture4: ImageView = v.findViewById(R.id.choose_body_picture8)
        picture1.setOnClickListener { v ->
            bodyPictureClickHandle(R.drawable.choose_body_picture5,"Громовержец", activity!!, picture1, v)
        }
        picture2.setOnClickListener { v ->
            bodyPictureClickHandle(R.drawable.choose_body_picture6,"Дьявол", activity!!, picture2, v)
        }
        picture3.setOnClickListener { v ->
            bodyPictureClickHandle(R.drawable.choose_body_picture7,"Пантера", activity!!, picture3, v)
        }
        picture4.setOnClickListener { v ->
            bodyPictureClickHandle(R.drawable.choose_body_picture8,"Паук-3", activity!!, picture4, v)
        }
        return v
    }
}
