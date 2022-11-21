package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter  extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Tree> trees;

    public ListAdapter(Context context, int layout, ArrayList<Tree> trees) {
        this.context = context;
        this.layout = layout;
        this.trees = trees;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return trees.size();
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.activity_item,null);
        TextView name = view.findViewById(R.id.tenthuonggoi);
        TextView dactinh = view.findViewById(R.id.dactinh);
        TextView maula = view.findViewById(R.id.maula);
        ImageView image = view.findViewById(R.id.image_item);

        Tree tree = trees.get(i);
        name.setText(tree.getTenThuonggoi());
        dactinh.setText(tree.getDacTinh());
        maula.setText(tree.getMauLa());
        image.setImageResource(tree.getHinhAnh());
        return view;
    }
}
