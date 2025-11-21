//package com.example.mariletterbox;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//import java.util.List;
//
//public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
//    private List<Movie> movies;
//    private Context context;
//
//    public MovieAdapter(Context context, List<Movie> movies) {
//        this.context = context;
//        this.movies = movies;
//    }
//
//    @NonNull
//    @Override
//    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context).inflate(R.layout.movie_grid_item, parent, false);
//        return new MovieViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
//        Movie movie = movies.get(position);
//        holder.movieImage.setImageResource(movie.getImageResId());
//        holder.movieTitle.setText(movie.getTitle());
//        holder.movieRating.setText(String.format("%.1f", movie.getRating()));
//    }
//
//    @Override
//    public int getItemCount() {
//        return movies.size();
//    }
//
//    public static class MovieViewHolder extends RecyclerView.ViewHolder {
//        ImageView movieImage;
//        TextView movieTitle;
//        TextView movieRating;
//
////        public MovieViewHolder(@NonNull View itemView) {
////            super(itemView);
////            movieImage = itemView.findViewById(R.id.movieImage);
////            movieTitle = itemView.findViewById(R.id.movieTitle);
////            movieRating = itemView.findViewById(R.id.movieRating);
//        }
//    }
//}
package com.example.mariletterbox;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MovieAdapter extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
