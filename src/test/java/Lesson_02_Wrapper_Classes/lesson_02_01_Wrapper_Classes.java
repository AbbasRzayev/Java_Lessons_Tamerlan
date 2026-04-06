package Lesson_02_Wrapper_Classes;

public class lesson_02_01_Wrapper_Classes {


    public static void main(String[] args) {

//Wrapper Class nədir?
//Wrapper Class — primitive data type-ların object (obyekt) formasında olan versiyasıdır.



//Mapping Cədvəli — Ətraflı
//| Primitiv | Wrapper Class| Default (primitive) | Default (Wrapper) | Yaddaş |
//|----------|--------------|---------------------|-------------------|--------|
//| byte     | Byte         | 0                   | null              | 1 byte |
//| short    | Short        | 0                   | null              | 2 byte |
//| int      | Integer      | 0                   | null              | 4 byte |
//| long     | Long         | 0L                  | null              | 8 byte |
//| float    | Float        | 0.0f                | null              | 4 byte |
//| double   | Double       | 0.0                 | null              | 8 byte |
//| char     | Character    | '\u0000'            | null              | 2 byte |
//| boolean  | Boolean      | false               | null              | 1 bit  |

//3. Primitiv vs Wrapper — Ətraflı Fərqlər
//| Xüsusiyyət           | int (primitive) | Integer (Wrapper)|
//|----------------------|-----------------|------------------|
//| Nədir                | Sadə dəyər      | Obyekt (class)   |
//| Default dəyər        | 0               | null             |
//| Null ola bilər       | ❌ Xeyr         | ✅ Bəli          |
//| Metodu var           | ❌ Xeyr         | ✅ Bəli          |
//| Yaddaş               | Az tutur        | Daha çox tutur   |
//| Sürət                | Sürətli         | Bir az yavaş     |
//| Collections-da       | ❌ İşləmir      | ✅ İşləyir       |
//| API/DB null handling | ❌ Problem      | ✅ Dəstəkləyir   |

//Java-da primitive-lər çox sürətlidir, amma object deyil.
//Bəzi hallarda isə bizə object lazımdır — məsələn List, API, Collections.
//Buna görə Java Wrapper Class-ları yaradılıb.

//Primitiv  → sürətli, az yaddaş, null yoxdur, metod yoxdur
//Wrapper   → obyekt, null ola bilər, metodlar var, Collections-da işləyir

        Byte year=34;
        Short someCount=345;
        Integer week=3453459;
        Long longCount =56563345634634456L;
        Float food=15.12f;
        Double twix=1.3435343635;
        Boolean isThatTrue=true;
        Character checkChar = 'H';
    }
}