package me.kosgei.football.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.kosgei.football.R;
import me.kosgei.football.models.Fixture;
import me.kosgei.football.view.HeadToHeadActivity;

public class FixtureAdapter extends RecyclerView.Adapter<FixtureAdapter.FixtureViewHolder> {
    private ArrayList<Fixture> mFixtures = new ArrayList<>();
    private Context mContext;

    public FixtureAdapter(ArrayList<Fixture> mFixtures, Context mContext) {
        this.mFixtures = mFixtures;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public FixtureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fixture_item, parent, false);
        return new FixtureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FixtureViewHolder holder, int position) {
        holder.bindFixture(mFixtures.get(position));

    }

    @Override
    public int getItemCount() {
        return mFixtures.size();
    }

    public class FixtureViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        @BindView(R.id.home_team_image)
        ImageView homeTeamImage;
        @BindView(R.id.home_team_name)
        TextView homeTeamName;
        @BindView(R.id.away_team_image)
        ImageView awayTeamImage;
        @BindView(R.id.away_team_name)
        TextView awayTeamName;


        public FixtureViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            itemView.setOnClickListener(this);

        }

        public void bindFixture(Fixture fixture)
        {
            Picasso.with(mContext).load(fixture.getHomeTeamLogo()).into(homeTeamImage);
            homeTeamName.setText(fixture.getHomeTeamName());

            Picasso.with(mContext).load(fixture.getAwayTeamLogo()).into(awayTeamImage);
            awayTeamName.setText(fixture.getAwayTeamName());

        }

        @Override
        public void onClick(View view) {
            int itemPosition = getLayoutPosition();

            Intent intent = new Intent(mContext, HeadToHeadActivity.class);
            intent.putExtra("fixture", Parcels.wrap(mFixtures.get(itemPosition)));
            mContext.startActivity(intent);
        }
    }
}
