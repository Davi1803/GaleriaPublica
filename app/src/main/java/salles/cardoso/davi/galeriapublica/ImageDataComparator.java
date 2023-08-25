package salles.cardoso.davi.galeriapublica;

import android.media.Image;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

    class ImageDataComparator extends DiffUtil.ItemCallback<ImageData> {
@Override
public boolean areItemsTheSame(@NonNull ImageData oldItem, @NonNull ImageData newItem) {
        // Id is unique.
        return oldItem.uri.equals(newItem.uri);
        }
@Override
public boolean areContentsTheSame(@NonNull ImageData oldItem, @NonNull ImageData newItem) {
        return oldItem.uri.equals(newItem.uri);
        }
        }