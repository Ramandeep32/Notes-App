package com.raman.notes
import android.app.Activity
import android.app.DownloadManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat.startActivity

class NoteAdapter (val context:Activity,val list:ArrayList<Note>): ArrayAdapter<Note>(context,R.layout.item_layout,list){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view=LayoutInflater.from(context).inflate(R.layout.item_layout,null)
        val name:TextView;
        val down:Button;
        val image:ImageView;
        val note_view:Button;
        image = view.findViewById(R.id.player_image)
        name=view.findViewById(R.id.player_name)
        down=view.findViewById(R.id.note_download)
        note_view=view.findViewById(R.id.note_view)
        name.text=list[position].player_name
        image.setImageResource(list[position].player_image)
        if (note_view != null) {
            note_view.setOnClickListener {
                var PdfUri = Uri.parse(list[position].view_url)
                val bundle = Bundle()
                bundle.putString("DRIVE_URL",list[position].view_url)
                var intent=Intent(Intent.ACTION_VIEW,PdfUri)
                intent.putExtras(bundle)
                startActivity(context,intent,bundle)
            }
        }
        if (down != null) {
            down.setOnClickListener{
                var download= context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                var PdfUri = Uri.parse(list[position].url)
                var getPdf = DownloadManager.Request(PdfUri)
                getPdf.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                download.enqueue(getPdf)
                Toast.makeText(context,"Download Started", Toast.LENGTH_LONG).show()


            }
        }

        return view
    }


}

