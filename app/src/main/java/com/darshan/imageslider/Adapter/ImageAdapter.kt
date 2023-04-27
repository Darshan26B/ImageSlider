package com.darshan.imageslider.Adapter

import android.provider.MediaStore.Images
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.darshan.imageslider.databinding.VpItemBinding

class ImageAdapte (imgs:Array<Int>): PagerAdapter() {
    var images=imgs;

        override fun getCount(): Int {
        return images.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
    return  view==`object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var binding=VpItemBinding.inflate(LayoutInflater.from(container.context),container,false)
        binding.ImageItem.setImageResource(images.get(position))
        container.addView(binding.root)
        return binding.root
    }
}