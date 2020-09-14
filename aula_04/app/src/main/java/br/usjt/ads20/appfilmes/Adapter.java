package br.usjt.ads20.appfilmes;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import br.usjt.ads20.appfilmes.model.Hero;

public class Adapter extends BaseAdapter {
    private Hero[] heroList;
    private Context context;

    public Adapter(Context context, Hero[] heroList) {
        this.heroList = heroList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return heroList.length;
    }

    @Override
    public Object getItem(int i) {
        if(i >=0 && i < heroList.length) {
            return heroList[i];
        } else {
            return null;
        }
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.custom_view, viewGroup, false);
            ImageView posterFilme = (ImageView) view.findViewById(R.id.image);
            TextView nomeFilme = (TextView) view.findViewById(R.id.name);
            TextView detalheFilme = (TextView) view.findViewById(R.id.info);
            view.setTag(new ViewHolder(posterFilme, nomeFilme, detalheFilme));
        }
        ViewHolder holder = (ViewHolder)view.getTag();
        Drawable drawable = Util.getDrawable(context,
                heroList[i].getPosterPath().substring(0,
                        heroList[i].getPosterPath().length()-4).toLowerCase());
        holder.getImage().setImageDrawable(drawable);
        holder.getName().setText(heroList[i].getTitulo());

        return view;
    }
}
