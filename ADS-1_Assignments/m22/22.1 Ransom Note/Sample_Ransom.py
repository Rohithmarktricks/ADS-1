a = input().split()
list_mag = input().split()
list_note = input().split()
list_test = list_note.copy()
for note in list_note:
	if note in list_mag:
		list_test.remove(note)
		list_mag.remove(note)
if (len(list_test) == 0):
	print("Yes")
else:
	print("No")