package com.example.portfolio.portfolio;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.portfolio.R;
import com.example.portfolio.cv.CVItem;

import java.util.ArrayList;
import java.util.List;

public class PortfolioFragment extends Fragment implements PortfolioCallback {


    List<PortfolioItem> mdata;
    RecyclerView rv_portfolio;
    PortfolioAdapter portfolioAdapter;
    public PortfolioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portfolio, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_portfolio = view.findViewById(R.id.rv_portfolio);

        mdata = new ArrayList<>();
        mdata.add(new PortfolioItem(R.drawable.sort,getString(R.string.pro)));
        mdata.add(new PortfolioItem(R.drawable.health,getString(R.string.det)));

        mdata.add(new PortfolioItem(R.drawable.port,getString(R.string.det)));




        portfolioAdapter = new PortfolioAdapter(mdata,this);

         rv_portfolio.setLayoutManager(new GridLayoutManager(getActivity(),3));
         rv_portfolio.setAdapter(portfolioAdapter);



    }

    @Override
    public void onPortfolioItemClick(int pos) {


        portfolioFragmentDetails portfolioFragmentDetails = new portfolioFragmentDetails();


        Bundle bundle = new Bundle();
        bundle.putSerializable("object",mdata.get(pos));
        portfolioFragmentDetails.setArguments(bundle);

        // now let's open the portfolio bottom sheet fregment

        portfolioFragmentDetails.show(getActivity().getSupportFragmentManager(),"tagname");

    }
}