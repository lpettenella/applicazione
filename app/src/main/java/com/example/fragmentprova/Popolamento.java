package com.example.fragmentprova;

import android.content.Context;

public class Popolamento {

    private Context context;
    private DBAdapterLogin db;

    public Popolamento(Context context){
        this.context = context;
        this.db = new DBAdapterLogin(context);
        popolaOutfit();
        popolaTipoOutfit();
        popolaTipoVestito();
    }

    private void popolaOutfit(){
        db.addOutfit(0, "InvernaleFeriale", 0, 0, 0, 0);
        db.addOutfit(0, "invernale 1", 0, 5, 1, 1);
    }

    private void popolaTipoOutfit(){
        db.addTipoOutfit(1, "Completo", null, null);
        int[] i = {1};
        int[] tv1 = {1,2};
        int[] tv2 = {3};
        db.addTipoOutfit(2, "Sopra", i, tv1);
        db.addTipoOutfit(3, "Intimo", i, tv2);
    }

    private void popolaTipoVestito(){
        db.addTipoVestito(1, "Camicia");
        db.addTipoVestito(2, "Pantalone");
        db.addTipoVestito(3, "Maglietta");
    }
}
