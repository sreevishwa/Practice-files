public class ExampleAdapter extends RecyclerView.Adapter<ViewHolder> {

  private List<DataModel> dataSet;
  private Context context;

  public ExampleAdapter(
      List<DataModel> dataSet, Context context) {
    this.dataSet = dataSet;
    this.context = context;
  }

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.LAYOUT_ID_HERE, parent, false);
    return new ViewHolder(view);
  }


  @Override
  public void onBindViewHolder(@NonNull final ViewHolder holder,
      final int position) {

  }


  @Override
  public int getItemCount() {
    return dataSet.size();
  }


  class ViewHolder extends RecyclerView.ViewHolder {

    ViewHolder(final View itemView) {
      super(itemView);
    }

  }

}
