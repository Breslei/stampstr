/* $********** SCADE Suite KCG 32-bit 6.6 (build i19) ***********
** Command: kcg66.exe -config C:/Users/guilh/Desktop/ITA/stampstr/hospitais/Time3/US55/US55Project/KCG/config.txt
** Generation date: 2017-09-17T22:16:55
*************************************************************$ */

#include "kcg_types.h"

#ifdef kcg_use_array_bool_10000
kcg_bool kcg_comp_array_bool_10000(
  array_bool_10000 *kcg_c1,
  array_bool_10000 *kcg_c2)
{
  kcg_bool kcg_equ;
  kcg_size kcg_ci;

  kcg_equ = kcg_true;
  for (kcg_ci = 0; kcg_ci < 10000; kcg_ci++) {
    kcg_equ = kcg_equ & ((*kcg_c1)[kcg_ci] == (*kcg_c2)[kcg_ci]);
  }
  return kcg_equ;
}
#endif /* kcg_use_array_bool_10000 */

#ifdef kcg_use_struct_275
kcg_bool kcg_comp_struct_275(struct_275 *kcg_c1, struct_275 *kcg_c2)
{
  kcg_bool kcg_equ;

  kcg_equ = kcg_true;
  kcg_equ = kcg_equ & kcg_comp_array_bool_10000(&kcg_c1->items, &kcg_c2->items);
  kcg_equ = kcg_equ & (kcg_c1->idx == kcg_c2->idx);
  return kcg_equ;
}
#endif /* kcg_use_struct_275 */

/* $********** SCADE Suite KCG 32-bit 6.6 (build i19) ***********
** kcg_types.c
** Generation date: 2017-09-17T22:16:55
*************************************************************$ */

