package id.ac.umn.week11_27963;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    ArrayList<PostModel> posts;

    public PostAdapter(ArrayList<PostModel> posts) { this.posts = posts; }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false);

        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.tvTitle.setText(posts.get(position).getTitle());
        holder.tvBody.setText(posts.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public static class PostViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvBody;

        public PostViewHolder(@NonNull View itemview) {
            super(itemview);

            tvBody = itemView.findViewById(R.id.tvBody);
            tvTitle = itemView.findViewById(R.id.tvTitle);
        }
    }
}
